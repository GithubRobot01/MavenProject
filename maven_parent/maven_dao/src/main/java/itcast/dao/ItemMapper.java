package itcast.dao;

import itcast.pojo.Item;

public interface ItemMapper {
    Item findById(int id);
}
