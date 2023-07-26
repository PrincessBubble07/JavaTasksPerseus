package week9.Question3;
import java.util.ArrayList;
import java.util.List;

public class Elizabeth {

    // /*
    //    ArrayList - Remove some values
    //  Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
    //     */

        public static void main(String[] args) {
            int[] given_list = {1,2,3,4,5,6,7,8};

            //since there is no direct way to delete an element from the array we have to use something other than array, like a list.
            List<Integer> list = new ArrayList<Integer>();

            //this changes the whole array to list
            for (int i : given_list){
                list.add(i);
            }

            //this iterates through the list and check each element if its greater then 100
            for(int i=0;i<list.size();i++){
                if(list.get(i) > 100){
                    list.remove(i);
                    i--;     // this is because everytime we delete an element, the next comes in place of it so we need to check new element.
                }
            }

            //print out the new list which has all the elements which are less than 100
            System.out.println(list);

        }
}

//Since there is no way to delete an element from an array,
// we have to change array to list and then operate on that list so we can delete elements as we want.





