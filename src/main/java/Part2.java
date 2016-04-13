import huffmantrees.BinaryTree;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by emre on 4/12/16.
 */
public class Part2<E>  extends BinaryTree<E>{

    public Part2()
    {
        super();
    }

    
    public Iterator<E> getIterator(){

        return new Binarytreeiterator<E>(root);
    }

    class Binarytreeiterator<E> implements Iterator<E>{

        private Stack<Node<E>> TreeStack;

        public Binarytreeiterator(Node<E> root)
        {
            TreeStack = new Stack<Node<E>>();
            buildStack(root);
        }
        public boolean hasNext() {
            return !TreeStack.isEmpty();
        }

        public E next() {
            return TreeStack.pop().data;
        }

        public void remove() {

        }

        private void buildStack(Node<E> root)
        {
            if(root != null)
            {
                buildStack(root.left);
                TreeStack.push(root);
                buildStack(root.right);
            }
        }
    }

}
