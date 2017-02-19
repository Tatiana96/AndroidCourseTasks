package test.task;

public class Main {

    public static void main(String[] args) throws Exception {

        Integer[] elementsArray = {0, 1, 2, 3, 4, 5, 6, 7};

        SetSystem setSystemInstance = new SetSystem(elementsArray);

        setSystemInstance.makeUnionOfElements(1, 4);
        setSystemInstance.makeUnionOfElements(4, 5);

        setSystemInstance.makeUnionOfElements(2, 3);
        setSystemInstance.makeUnionOfElements(2, 6);
        setSystemInstance.makeUnionOfElements(3, 6);
        setSystemInstance.makeUnionOfElements(3, 7);

        System.out.println("find(2, 5) before union: " + setSystemInstance.findUnionOfElements(2, 5));
        System.out.println("find(0, 1) : " + setSystemInstance.findUnionOfElements(0, 1));

        setSystemInstance.makeUnionOfElements(2, 5);

        System.out.println("find(2, 5) after union: " + setSystemInstance.findUnionOfElements(2, 5));
        System.out.println("find(5, 6) : " + setSystemInstance.findUnionOfElements(5, 6));

    }
}
