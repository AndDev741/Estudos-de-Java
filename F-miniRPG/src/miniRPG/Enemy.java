package miniRPG;

public interface Enemy {
	public abstract boolean isDied();
	public abstract void ElementPower(String element);
	public abstract void receiveDamage(int damage);
	public abstract Item dropItem();
}
