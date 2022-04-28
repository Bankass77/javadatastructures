package javadatastructures.algorithms.designpatterns.abstractFactory.exemple1;

public interface AbstractWidgetFactory {

	public Window createWindow();

	public Scroll createScroll();

	public Button[] createNavigationButtons();

}
