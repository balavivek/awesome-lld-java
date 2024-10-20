package awesome.lld.java.generics.datarepository;

import java.util.ArrayList;
import java.util.List;

/**
 * The DataRepository class uses generics to store and retrieve data of any type.
 *
 * @param <T> The type of data to store.
 */
public class DataRepository<T> {
    private List<T> dataList = new ArrayList<>();

    /**
     * Adds data to the repository.
     *
     * @param data The data to add.
     */
    public void addData(T data) {
        dataList.add(data);
    }

    /**
     * Retrieves all data from the repository.
     *
     * @return A list of all data.
     */
    public List<T> getAllData() {
        return dataList;
    }
}
