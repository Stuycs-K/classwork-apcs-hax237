import java.util.ArrayList;
public class ArrayListPractice {
  public static ArrayList<String>createRandomArray(int size) {
    ArrayList<String> x = new ArrayList<String>(size);
    for (int i = 0; i < size; i++) {
      x.add("" + (int)(11 * Math.random()));
      if (x.get(i).equals("0")) {
        x.set(i, "");
      }
    }
    return x;
  }

  public static void replaceEmpty( ArrayList<String> original){
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
    for (int i = 0; i < original.size(); i++){
      if (original.get(i).equals("")){
        original.set(i, "Empty");
      }
    }
  }

  public static ArrayList<String> makeReversedList( ArrayList<String> original){
  //return a new ArrayList that is in the reversed order of the original.
  ArrayList<String> result = new ArrayList<String>(original.size());
  for (int i = original.size() - 1; i >= 0; i--){
    result.add(original.get(i));
    }
    return result;
  }

  
  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //If one list is longer than the other, just attach the remaining values to the end.
  ArrayList<String> combo = new ArrayList<String> (a.size() + b.size());

  int min = Math.min(a.size(), b.size());
  int max = Math.max(a.size(), b.size());
  int i = 0;
  while (i < min) {
    combo.add(a.get(i));
    combo.add(b.get(i));
    i++;
  }
  if (a.size() > b.size()){
    for (; i < max; i++){
      combo.add(a.get(i));
    }
  }
  if (a.size() < b.size()){
    for (; i < max; i++){
      combo.add(b.get(i));
    }
  }
  return combo;

  }
  

  public static void main(String[] args) {
    System.out.println(createRandomArray(5));

    ArrayList<String> ar1 = createRandomArray(20);
    System.out.println(ar1);
    replaceEmpty(ar1);
    System.out.println(ar1);
    System.out.println(makeReversedList(ar1));

    ArrayList<String> ar2 = createRandomArray(20000);
    System.out.println(ar2);
    replaceEmpty(ar2);
    System.out.println(ar2);
    System.out.println(makeReversedList(ar2));

    System.out.println("");

    ArrayList<String> first = createRandomArray(7);
    ArrayList<String> second = createRandomArray(10);
    System.out.println(first);
    System.out.println(second);
    System.out.println(mixLists(first, second));

    ArrayList<String> ar3 = createRandomArray(10000);
    System.out.println(ar3);
    System.out.println(mixLists(ar2, ar3));

    ArrayList<String> third = createRandomArray(10);
    System.out.println(mixLists(second, third));
  }
}