public class EvenString {
    public String longestEvenString(String sentence){

        String arr[] = sentence.split(" ");
        String longestEven = "00";
        int longestEvenLength = 0;
        for(int i=0;i<arr.length;i++){
            //System.out.println(arr[i]);
           // System.out.println(arr[i].length());
            if(arr[i].length()>longestEvenLength && arr[i].length()%2==0){
                longestEvenLength = arr[i].length();
                //System.out.println(longestEvenLength);
                longestEven = arr[i];
            }
        }
        return longestEven;
    }
}
