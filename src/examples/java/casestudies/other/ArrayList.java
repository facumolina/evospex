package casestudies.other;

public class ArrayList {
  public int size;
  public Object[] list;
  
  public ArrayList() {
    size = -1;
    list = new Object[10];
  }
  
  public int size() {
    return size;
  }
  
  public Object get(int index) {
    if (0 <= index && index <= size) {
      return list[index];
    } else {
      throw new IndexOutOfBoundsException();
    }
  }
  
  public boolean contains(Object o) {
    for (int i = 0; i <= size; i++) {
      if (list[i] == o) {
        return true;
      }
    }
    return false;
  }
  
  public void set(int index, Object o) {
    if (0 <= index && index <= size) {
      list[index] = o;
    } else {
      throw new IndexOutOfBoundsException();
    }
  }
  
  private void enlarge() {
    Object[] newList;
    if (list.length >= Integer.MAX_VALUE-10 && list.length < Integer.MAX_VALUE) {
      newList = new Object[Integer.MAX_VALUE];
    } else {
      newList = new Object[list.length + 10];
    }
    for (int i = 0; i <= size; i++) {
      newList[i] = list[i];
    }
    list = newList;
  }
  
  public void add(Object o) {
    if (size == Integer.MAX_VALUE - 1) {
      throw new IndexOutOfBoundsException();
    }
    if (size == list.length - 1) {
      enlarge();
    }
    size = size + 1;
    list[size] = o;
  }
  
  public void remove(Object o) {
    for (int i = 0; i <= size; i++) {
      if (list[i] == o) {
        for (int j = i; j < size; j++) {
          list[j] = list[j+1];
        }
        size = size - 1;
        return;
      }
    }
  }
  
  public boolean isEmpty() {
    return size == -1;
  }
  
}
