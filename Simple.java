
public interface Simple<E> extends Iterable<E> {
	boolean add (E e);
	E get(int index);
	int size();
	boolean contains(String string);
    void update(int index, E e);
	void remove(int i);
   }
