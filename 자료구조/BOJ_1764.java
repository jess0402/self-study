package DataStructure;

import java.io.*;
import java.util.*;

// 24.03.07
public class BOJ_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap();
        ArrayList<String> nameList = new ArrayList();

        for(int i = 0; i < N; i++) {
            map.put(br.readLine(), 0);
        }

        for(int i = 0; i < M; i++) {
            String name = br.readLine();
            if(map.containsKey(name)) {
                nameList.add(name);
            }
        }
        Collections.sort(nameList);

        bw.write(nameList.size() + "\n");
        for(String name : nameList) {
            bw.write(name + "\n");
        }
        bw.flush();
        bw.close();
    }
}
