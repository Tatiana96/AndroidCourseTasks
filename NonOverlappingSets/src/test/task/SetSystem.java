package test.task;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Tatiana on 15.02.2017.
 */
public class SetSystem {

    private HashMap< Integer, ArrayList<Integer> > setSystem;

    public SetSystem(Integer[] elementsArray) throws Exception {

        setSystem = new HashMap< Integer, ArrayList<Integer> >();

        for (Integer value : elementsArray)
            addElementToSetSystem(value);
    }

    private boolean isExistElement(Integer elementValue) {

        return setSystem.containsKey(elementValue);
    }

    public void addElementToSetSystem(Integer elementValue) throws Exception {

        if (!isExistElement(elementValue))
            setSystem.put(elementValue, new ArrayList<Integer>());
        else
            throw new Exception("This element has already added.");
    }

    public boolean makeUnionOfElements(Integer firstElement, Integer secondElement) throws Exception {

        if (firstElement == secondElement)
            throw new Exception("These elements are equal.");

        if (!isExistElement(firstElement) || !isExistElement(secondElement))
            throw new Exception("One of these elements hasn't added yet.");

        setSystem.get(firstElement).add(secondElement);
        setSystem.get(secondElement).add(firstElement);

        return true;
    }

    public boolean findUnionOfElements(Integer firstElement, Integer secondElement) {

        if (firstElement == secondElement)
            return true;

        if (!isExistElement(firstElement) || !isExistElement(secondElement))
            return false;

        return setSystem.get(firstElement).contains(secondElement);
    }

}
