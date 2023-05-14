package coordinator.domain;

public abstract class AbstractFigure implements Figure {
	@Override
	public abstract String name();

	@Override
	public abstract double area();
}
