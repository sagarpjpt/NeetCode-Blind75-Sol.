/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    
    private Map<Node, Node> visited = new HashMap<>();
    
    public Node cloneGraph(Node node) {
            
            if(node == null)
                return null;
            
            //when node is already visited
            if(visited.containsKey(node))
                return visited.get(node);

            //now clone the current node
            Node cloneNode = new Node(node.val);
            visited.put(node, cloneNode);

            //clone neighbours
            for(Node neighbor : node.neighbors){
                cloneNode.neighbors.add(cloneGraph(neighbor));
            }

            return cloneNode;
    }
}
