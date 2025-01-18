class LRUCache(private val capacity: Int) {

    data class Node(
        val key: Int = -1,
        var value: Int = -1,
        var prev: Node? = null,
        var next: Node? = null,
    )

    private var head: Node = Node()
    private var tail: Node = Node()

    private val map = mutableMapOf<Int, Node>()

    init {
        head.next = tail
        tail.prev = head
    }

    fun get(key: Int): Int {
        val node = map[key] ?: return -1
        moveToHead(node)
        return node.value
    }

    fun put(key: Int, value: Int) {
        if (map.contains(key)) {
            val node = map[key]!!
            node.value = value
            moveToHead(node)
        } else {
            val node = Node(key = key, value = value)
            map[key] = node
            moveToHead(node)
            if (map.size > capacity) removeTail()
        }
    }

    private fun moveToHead(node: Node) {
        if (head.next != node) {
            node.prev?.next = node.next
            node.next?.prev = node.prev
            
            node.next = head.next
            node.prev = head

            head.next?.prev = node
            head.next = node
        }
    }

    private fun removeTail() {
        val node = tail.prev
        map.remove(node?.key)
        tail.prev = node?.prev
        node?.prev?.next = tail
        node?.prev = null
        node?.next = null
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * var obj = LRUCache(capacity)
 * var param_1 = obj.get(key)
 * obj.put(key,value)
 */