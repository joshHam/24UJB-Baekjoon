package q10845;
				//내풀이 미완;;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HJQueue que;
		try {
			String line = br.readLine();
			int cnt = Integer.parseInt(line);
			que= new HJQueue(cnt);
			
			for(int i=0; i<cnt;i++) {
				line = br.readLine();
				StringTokenizer st = new StringTokenizer(line);
				String cmd = st.nextToken();
				//System.out.println(cmd);
				
				if(cmd.equals("push")) {
					String cmd2 = st.nextToken();
					//System.out.println(cmd2);
					int p = Integer.parseInt(cmd2);
					que.offer(p);
				}else if(cmd.equals("pop")) {
					que.poll();
				}else if(cmd.equals("front")) {
					que.front();
				}else if(cmd.equals("back")) {
					que.back();
				}else if(cmd.equals("empty")) {
					que.empty();
				}else if(cmd.equals("size")) {
					que.size();
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

		
		
		
		
		
		
		
		
	}

}


class HJQueue{
	private int ar[];
	private int peek;
	
	public HJQueue(int size) {
		ar = new int[size];
		peek =-1;
	}
	
	public void offer(int X) {
		ar[++peek]=X;
	}
	
	public void poll() {
		if(peek==-1) {
			System.out.println(ar[peek]);
		}else {
			System.out.println(ar[peek--]);
		}
	}
	
	public void size() {
		System.out.println(peek+1);
	}
	
	public void empty() {
		if(peek==-1) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
	
	public void front() {
		if(peek==-1) {
			System.out.println("-1");
		}else {
			System.out.println(ar[0]);
		}
	}
	
	public void back() {
		if(peek==-1) {
			System.out.println("-1");
		}else {
			System.out.println(ar[peek]);
		}
	}
	
	
	
	
}