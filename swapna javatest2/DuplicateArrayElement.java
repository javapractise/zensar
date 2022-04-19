public class DuplicateArrayElement {
  public static void main(String[] args) {
    int[] numArray = {2, 6, 7, 6, 2, 19, 1, 19};
    Set<Integer> numSet = new HashSet<Integer>();
    for(int num : numArray){
      // If add returns false
      if(!numSet.add(num)){
        System.out.println("Duplicate element found " + num);
      }
    }
  }
}