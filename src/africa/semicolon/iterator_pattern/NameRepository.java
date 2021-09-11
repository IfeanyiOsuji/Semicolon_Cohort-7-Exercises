package africa.semicolon.iterator_pattern;

public class NameRepository{
    String []names = {"Bingo", "Husky", "Ajah"};
    public Iterator getIterator(){
        return new NameIterator();
    }
   private class NameIterator implements Iterator{
            int index;
        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            String name = "Hello World";
            char [] namesChar = name.toCharArray();
            return names[index++];
        }
    }

}
