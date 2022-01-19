import java.util.ArrayList;

public class BST<T extends Comparable<T>> {
    private ArrayList<T> tree;

    public BST(int size){
        tree =  new ArrayList<>(size);

        for (int i=0; i<size; i++){
            tree.add(null);
        }
    }

    public void insert(T d){
        int i = 0;
        while (i < tree.size() && tree.get(i) != null) {
            if (d.compareTo(tree.get(i)) < 0)
                i = (2 * i) + 1;
            else
                i = (2 * i) + 2;
        }

        tree.set(i,d);
    }

    public int find(T d) {
        int i = 0;
        boolean found = false;

        while (i < tree.size()) {
            if (d.compareTo(tree.get(i)) < 0)
                i = (2 * i) + 1;
            else if (d.compareTo(tree.get(i)) > 0)
                i = (2 * i) + 2;
            else {
                found = true;
                break;
            }
        }

        if (found){
            System.out.println(d + " found at " + i + ".");
            return i;
        }
        else {
            System.out.println(d + " not found.");
            return 0;
        }
    }

    public int[] findDel(T d) {
        int[] indices = new int[2];
        boolean found = false;
        int c = 0;
        int p = 0;
        while (c < tree.size() && tree.get(c) != null) {
            if (d.compareTo(tree.get(c)) < 0) {
                p = c;
                c = (2 * c) + 1;
            }
            else if (d.compareTo(tree.get(c)) > 0) {
                p = c;
                c = (2 * c) + 2;
            }
            else {
                found = true;
                break;
            }
        }
        if (found) {
            indices[0] = p;
            indices[1] = c;
            return indices;
        }
        else
            return null;
    }

    public void delNoChild(int child_index) {
        tree.set(child_index,null);
    }

    public void delOneChild(int child_index, int left, int right) {
        if (tree.get(right) == null) {
            tree.set(child_index,tree.get(left)) ;
            int right_temp = (2 * left) + 2;
            int left_temp = (2 * left) + 1;
            while (right_temp < tree.size() && left_temp < tree.size()) {
                tree.set(left,tree.get(left_temp));
                left = left_temp;
                tree.set(right,tree.get(right_temp));
                right = right_temp;

                right_temp = (2 * right) + 2;
                left_temp = (2 * left) + 1;
            }

            tree.set(left,null);
            tree.set(right,null);
        }
        else if (tree.get(left) == null) {
            tree.set(child_index,tree.get(right));
            int right_temp = (2 * right) + 2;
            int left_temp = (2 * right) + 1;
            while (right_temp < tree.size() && left_temp < tree.size()) {
                tree.set(left,tree.get(left_temp));
                left = left_temp;
                tree.set(right,tree.get(right_temp));
                right = right_temp;

                right_temp = (2 * right) + 2;
                left_temp = (2 * left) + 1;
            }

            tree.set(left,null);
            tree.set(right,null);
        }
    }

    public void delete(T d) {
        if (findDel(d) == null) {
            System.out.printf("\nKey not found, can't delete.\nThe list remains unchanged\n");
            return;
        }
        else {
            int[] ref = findDel(d);
            int c = ref[1];
            int right = (2 * c) + 2;
            int left = (2 * c) + 1;
//            System.out.printf("\nDeleting " + tree.get(c) + "\n");
            if ((right > tree.size() || left > tree.size()) || (tree.get(left) == null && tree.get(right) == null)) {//No child case
                delNoChild(c);
            } else if ((tree.get(right) == null && tree.get(left) != null) || (tree.get(right) != null && tree.get(left) == null)) { //One child case
                delOneChild(c, left, right);
            } else {
                int temp = right;
                int temp2 = 0;
                while (tree.get(temp) != null) {
                    temp2 = temp;
                    temp = (2 * temp) + 1;
                }
                tree.set(c,tree.get(temp2));
                c = temp2;

                right = (2 * c) + 2;
                left = (2 * c) + 1;
                if ((right > tree.size() || left > tree.size()) || (tree.get(left) == null && tree.get(right) == null)) {
                    delNoChild(c);
                } else if ((tree.get(right) == null && tree.get(left) != null) || (tree.get(right) != null && tree.get(left) == null)) {
                    delOneChild(c, left, right);
                }
            }
        }
    }

    // LEFT - ROOT - RIGHT
    public void traverse(int i) {
        if (i < tree.size() && tree.get(i) != null) {
            traverse((2 * i) + 1);
            System.out.print(tree.get(i) + " ");
            traverse((2 * i) + 2);
        }
    }

    // ROOT - LEFT - RIGHT
    public void preOder(int i) {
        if (i < tree.size() && tree.get(i) != null) {
            System.out.print(tree.get(i) + " ");
            preOder((2 * i) + 1);
            preOder((2 * i) + 2);
        }
    }

    // LEFT - RIGHT - ROOT
    public void postOder(int i) {
        if (i < tree.size() && tree.get(i) != null) {
            postOder((2 * i) + 1);
            postOder((2 * i) + 2);
            System.out.print(tree.get(i) + " ");
        }
    }

}
