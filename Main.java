import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double totArea = 0.0;
    
    int N = in.nextInt();
    
    int[] h = new int[N+1];
    int[] w = new int[N];
    
    for(int i=0;i<N+1;i++){
      h[i] = in.nextInt();
    }
    
    for(int i=0;i<N;i++){
      w[i] = in.nextInt();
    }

    for(int i=0;i<N;i++){
      if(h[i]<=h[i+1]){
        totArea += h[i]*w[i] + ((h[i+1]-h[i])*w[i])/2.0;
      }else{
        totArea += h[i+1]*w[i] + ((h[i]-h[i+1])*w[i])/2.0;
      }
    }
    System.out.println(totArea);
  }
}