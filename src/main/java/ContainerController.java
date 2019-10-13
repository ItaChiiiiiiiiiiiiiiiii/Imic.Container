// Định nghĩa hàm
import java.util.ArrayList;
import java.util.Scanner;

public class ContainerController {

    Scanner sc= new Scanner(System.in);
    public ArrayList<Container> addCon (ArrayList<Container> conList) {
        while(true){
            System.out.println("Ban co muon them 1 container? Chon 1 de nhap 2 de thoat");
            String i = sc.nextLine();
            if(i.equals("1")){
                Container c = new Container();

                System.out.println("Moi ban nhap vao id cua container ");
                c.setIdContainer(sc.nextLine());
                System.out.println("Moi ban nhap vao chieu dai cua container: ");
                c.setLengthContainer(sc.nextLine());
                System.out.println("Moi ban nhap vao chieu cao cua container: ");
                c.setHeightContainer(sc.nextLine());
                System.out.println("Moi ban nhap vao loai container (dong lanh/thuong) : ");
                c.setKindContainer(sc.nextLine());
                System.out.println("Moi ban nhap tinh trang cua container( dung duoc: true / khong: false) : ");
                c.setActiveFlag(sc.nextBoolean());
                System.out.println("Moi ban nhap mo ta cho container: ");
                c.setDescriptionContainer(sc.nextLine());
                conList.add(c);
            }
            else if(i.equals("2"))break;
        }
        return conList;
    }
    public void displayContainer(ArrayList<Container>conList1){
        for (Container c1: conList1
             ) {
            System.out.println(c1.toString());
        }
    }
    public void checkKindContainer(ArrayList<Container>conList){
        ArrayList<Container>frozenConList = new ArrayList<Container>();
        ArrayList<Container>normalConList = new ArrayList<Container>();

        for (Container c1:conList
             ) {
                if(c1.getKindContainer().equals("dong lanh")){
                    System.out.println("Nhung container dong lanh: ");
                    frozenConList.add(c1);
                    System.out.println(c1.toString());
                }
                else if(c1.getKindContainer().equals("thuong")){

                        System.out.println("Nhung container thuong la: ");
                        normalConList.add(c1);
                        System.out.println(c1.toString());
                    }
        }


    }
    public void fixConList(ArrayList<Container>conList){
        ArrayList<Container> container = new ArrayList<Container>();
        for (Container c3:conList
             ) {
                    if(!c3.isActiveFlag()){
                        System.out.println(c3.getDescriptionContainer());
                        container.add(c3);
                        System.out.println(c3.toString());
                    }
        }
    }
}

