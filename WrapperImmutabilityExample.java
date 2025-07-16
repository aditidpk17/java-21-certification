public class WrapperImmutabilityExample {
    @Override
    public int hashCode() {
        return this.getClass().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        WrapperImmutabilityExample that = (WrapperImmutabilityExample) obj;
        return this.hashCode() == that.hashCode();
    }

    public static void main(String[] args) {
        Integer num = 10;

        System.out.println("Original Integer: " + num);
        System.out.println("HashCode: " + num.hashCode());

        num++;

        System.out.println("After Incrementing: " + num);
        System.out.println("HashCode after Increment: " + num.hashCode());
    }
}
