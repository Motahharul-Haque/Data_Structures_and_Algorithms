package Searching_Algorithm;

public class InterpolationSearch {
    public static void main(String[] args) {
        DataSet data = new DataSet(1000);
        int search = 700;
        boolean isFound=false; 
        int low = 0;
        int high = data.getSize()-1; 
        int mid = 0;

        while(!isFound)
        {
            if(low > high)
            {
                System.out.println("Element is not found");
                break;
            }
            mid = low + (((high - low) / (data.data[high] - data.data[low]))*(search - data.data[low]));
            data.numberTry++; 
             if(data.data[mid] == search)
            {
                System.out.println("Element is Found after :"+data.numberTry+" try");
                break;
            }

            if(data.data[mid] < search)
            {
                low = mid+1;
            }
            if(data.data[mid] > search)
            {
                high = mid-1;
            }
        }
    }

}
