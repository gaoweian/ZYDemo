//����
public class sun{
	public static void main (String[] args){
		int i,a,b=1;
		for(a=100;a<=200;a++){	
			 for(i=2;i<a;i++){
				b=1;
				if(a%i==0) {
					b=0;
					break;
				}
			} 
			if(b==1) {
				System.out.printf(a+"������\n");
			}
		}
	}  
}
