package suffixtree;

import java.util.HashMap;
import java.util.Map;

public class SuffixTree {
    private String text;
    private SuffixTreeNode root;

    public SuffixTree(String text) {
        this.text = text;
        this.root = new SuffixTreeNode();
        buildSuffixTree();
    }

    // Build the suffix tree
    private void buildSuffixTree() {
        int n = text.length();
        root = new SuffixTreeNode();
        SuffixTreeNode lastNewNode = null;
        int activeLength = 0;
        int activeEdge = 0;
        int remainder = 0;

        for (int i = 0; i < n; i++) {
            lastNewNode = null;
            remainder++;

            while (remainder > 0) {
                if (activeLength == 0) {
                    activeEdge = i;
                }

                if (!root.children.containsKey(text.charAt(activeEdge))) {
                    root.children.put(text.charAt(activeEdge), new SuffixTreeNode());
                    if (lastNewNode != null) {
                        lastNewNode.suffixLink = root;
                        lastNewNode = null;
                    }
                } else {
                    SuffixTreeNode nextNode = root.children.get(text.charAt(activeEdge));
                    int edgeLength = nextNode.end - nextNode.start + 1;

                    if (activeLength >= edgeLength) {
                        activeLength -= edgeLength;
                        activeEdge += edgeLength;
                        continue;
                    }

                    if (text.charAt(nextNode.start + activeLength) == text.charAt(i)) {
                        activeLength++;
                        if (lastNewNode != null) {
                            lastNewNode.suffixLink = root;
                        }
                        break;
                    }

                    SuffixTreeNode splitNode = new SuffixTreeNode(nextNode.start, nextNode.start + activeLength - 1);
                    root.children.put(text.charAt(activeEdge), splitNode);
                    splitNode.children.put(text.charAt(i), new SuffixTreeNode(i, n - 1));
                    nextNode.start += activeLength;
                    splitNode.children.put(text.charAt(nextNode.start), nextNode);
                    if (lastNewNode != null) {
                        lastNewNode.suffixLink = splitNode;
                    }
                    lastNewNode = splitNode;
                }
                remainder--;
                if (root == root.suffixLink) {
                    break;
                }
            }
        }
    }

    // Search for a pattern in the suffix tree
    public boolean search(String pattern) {
        SuffixTreeNode node = root;
        for (char c : pattern.toCharArray()) {
            if (node.children.containsKey(c)) {
                node = node.children.get(c);
            } else {
                return false;
            }
        }
        return true;
    }

    // Node class representing a node in the suffix tree
    private static class SuffixTreeNode {
        int start;
        int end;
        Map<Character, SuffixTreeNode> children;
        SuffixTreeNode suffixLink;

        public SuffixTreeNode() {
            this.children = new HashMap<>();
            this.suffixLink = null;
            this.start = -1;
            this.end = -1;
        }

        public SuffixTreeNode(int start, int end) {
            this();
            this.start = start;
            this.end = end;
        }
    }
}
