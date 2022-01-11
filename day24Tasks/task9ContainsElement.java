package day24Tasks;

public class task9ContainsElement {
    public static void main(String[] args) {
int[]array={1,3,4,5,7,8,9};
int num=0;
boolean result=contains(array,num);
        System.out.println(result);
    }
    public static boolean contains(int[]array,int num){
        boolean result=false;
        for (int each:array) {
            while(num==each){
            result=true;
            break;
            }
        }
        return result;
    }
}
/*


	9. Create a method named contains that passes one integer array and one integer parameters, the method returns true
	 if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false
 */