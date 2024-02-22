

import java.util.*;
public class Activity9
{

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Saptarshi");
        myList.add("Aryan");
        myList.add("Sir");
        myList.add("Gublu");
        myList.add("John");

        for(int i=0;i<myList.size();i++)
        {
            System.out.println(myList.get(i));
        }

        System.out.println("Third Name :"+myList.get(2));
        System.out.println("Name Saptarshi found =" + myList.contains("Saptarshi"));
        System.out.println("Size:" + myList.size());

        myList.remove(2);
        System.out.println("Size after removing : "+myList.size());
    }

}
