import java.util.*;

//interface Stack<E> {
//
//    // Elementi na stekot se objekti od proizvolen tip.
//
//    // Metodi za pristap:
//
//    public boolean isEmpty ();
//    // Vrakja true ako i samo ako stekot e prazen.
//
//    public E peek ();
//    // Go vrakja elementot na vrvot od stekot.
//
//    // Metodi za transformacija:
//
//    public void clear ();
//    // Go prazni stekot.
//
//    public void push (E x);
//    // Go dodava x na vrvot na stekot.
//
//    public E pop ();
//    // Go otstranuva i vrakja elementot shto e na vrvot na stekot.
//}
//
//class ArrayStack<E> implements Stack<E> {
//    private E[] elems;
//    private int depth;
//
//    @SuppressWarnings("unchecked")
//    public ArrayStack (int maxDepth) {
//        // Konstrukcija na nov, prazen stek.
//        elems = (E[]) new Object[maxDepth];
//        depth = 0;
//    }
//
//
//    public boolean isEmpty () {
//        // Vrakja true ako i samo ako stekot e prazen.
//        return (depth == 0);
//    }
//
//
//    public E peek () {
//        // Go vrakja elementot na vrvot od stekot.
//        if (depth == 0)
//            throw new NoSuchElementException();
//        return elems[depth-1];
//    }
//
//
//    public void clear () {
//        // Go prazni stekot.
//        for (int i = 0; i < depth; i++)  elems[i] = null;
//        depth = 0;
//    }
//
//
//    public void push (E x) {
//        // Go dodava x na vrvot na stekot.
//        elems[depth++] = x;
//    }
//
//
//    public E pop () {
//        // Go otstranuva i vrakja elementot shto e na vrvot na stekot.
//        if (depth == 0)
//            throw new NoSuchElementException();
//        E topmost = elems[--depth];
//        elems[depth] = null;
//        return topmost;
//    }
//}
//
//public class StackBukvi {
//    static int proveri_t_posle_s(char [] st){
//        //Code here
//        int max=0;
//        int main=0;
//
//        ArrayStack<Character> stackS = new ArrayStack<Character>(st.length);
//        ArrayStack<Character> stackT = new ArrayStack<Character>(st.length);
//
//        for(int i = 0; i<st.length;i++){
//            int rez=0;
//            char curr = st[i];
//            if(curr=='S'){
//                for(int j = i+1;j<st.length;j++){
//                    char incurr = st[j];
//                    if(incurr=='S')
//                        break;
//                    if(incurr=='T'){
//                        stackS.push(curr);
//                        stackT.push(incurr);
//                        rez++;
//                    }
//                }
//                if(rez!=max){
//                    max=rez;
//                    main++;
//                }
//            }
//        }
//        if(main==1){
//            return 1;
//        }
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        char [] niza = new char[100];
//
//        Scanner f = new Scanner(System.in);
//        String st = f.next();
//        niza=st.toCharArray();
//
//        int rez=proveri_t_posle_s(niza);
//        System.out.println(rez);
//    }
//}
