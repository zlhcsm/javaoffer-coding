```java
import java.util.*;

class Line{
    String fId;
    String sId;
    String name;

    public void setfId(String fId) {
        this.fId = fId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getfId() {
        return fId;
    }

    public String getsId() {
        return sId;
    }

    public String getName() {
        return name;
    }
}
public class Main {

    private static String line;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = Integer.parseInt(scan.nextLine());
            List<Line> list = new ArrayList<>();
            while (n-- > 0){
                String[] arr = scan.nextLine().split(",");
                Line line = new Line();
                line.fId = arr[0];
                line.sId = arr[1];
                line.name = arr[2];
                list.add(line);
            }


            List<Line> res = new ArrayList<>();
            int m = Integer.parseInt(scan.nextLine());
            while (m-- > 0){
                line = scan.nextLine();
                String[] arr = line.split(",");
                for (Line line1 : list) {
                    Line l = new Line();
                    if (line1.sId.equals(arr[1])  && line1.fId.equals(arr[0])){
                        l.name = line1.getName();
                        l.sId = arr[3];
                        l.fId = arr[2];
                        res.add(l);
                    }
                }
            }

            for (Line l1 : list) {
                int flag = 1;
                for (Line re : res) {
                    if (l1.name.equals(re.name))
                        flag = 0;
                }
                if (flag == 1)
                    res.add(l1);
            }

            Collections.sort(res, new Comparator<Line>() {
                @Override
                public int compare(Line o1, Line o2) {
                    if (o1.fId.compareTo(o2.fId) == 0){
                        return o1.sId.compareTo(o2.sId);
                    }else{
                        return o1.fId.compareTo(o2.fId);
                    }
                }
            });


            List<Line> tmp = new ArrayList<>();
            for (Line line1 : res) {
                for (Line re : res) {
                    if (line1.sId.equals(re.sId) && line1.fId.equals(re.fId) && !line1.name.equals(re.name)){
                        tmp.add(line1);
                        tmp.add(re);
                    }
                    if (!line1.sId.equals(re.sId) && line1.fId.equals(re.fId) && line1.name.equals(re.name)){
                        tmp.add(line1);
                        tmp.add(re);
                    }

                }

          }

            for (Line line1 : tmp) {
                res.remove(line1);
            }

            for (Line line1 : res) {
                System.out.print(line1.getfId() + ","+ line1.getsId() +","+ line1.getName());
                System.out.println();
            }




        }

        scan.close();
    }


}
```