class DLLNode<E extends Comparable<E>> {
    protected E element;
    protected int br_pojavuvanja;
    protected DLLNode<E> pred, succ;

    public DLLNode(E elem, DLLNode<E> pred, DLLNode<E> succ) {
        this.element = elem;
        this.pred = pred;
        this.succ = succ;
        this.br_pojavuvanja = 1;
    }

    @Override
    public String toString() {
        return element.toString() + "Br.Pojavuvanja: " + this.br_pojavuvanja;
    }
}

public class DLL<E extends Comparable<E>> {
    private DLLNode<E> first, last;

    public E deleteFirst() {
        if (first != null) {
            DLLNode<E> tmp = first;
            first = first.succ;
            if (first != null)
                first.pred = null;
            if (first == null)
                last = null;
            return tmp.element;
        } else
            return null;
    }

    public E deleteLast() {
        if (first != null) {
            if (first.succ == null)
                return deleteFirst();
            else {
                DLLNode<E> tmp = last;
                last = last.pred;
                last.succ = null;
                return tmp.element;
            }
        }
        //else throw Exception
        return null;
    }

    public E delete(DLLNode<E> node) {
        if (node == first) {
            deleteFirst();
            return node.element;
        }
        if (node == last) {
            deleteLast();
            return node.element;
        }
        node.pred.succ = node.succ;
        node.succ.pred = node.pred;
        return node.element;
    }

    public void izvadiDupliIPrebroj() {
        if (first != null) {
            DLLNode<E> tmp = first, tmp2 = tmp.succ;
            while (tmp.succ != null) {
                while (tmp2 != null) {
                    if (tmp.element.compareTo(tmp2.element) == 0) {
                        tmp.br_pojavuvanja++;
                        tmp2 = tmp2.succ;
                        this.delete(tmp2.pred);
                    } else
                        tmp2 = tmp2.succ;
                }
                tmp = tmp.succ;
                tmp2 = tmp.succ;
            }
        } else
            return;
    }
}
