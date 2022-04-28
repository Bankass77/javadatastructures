package javadatastructures.algorithms.designpatterns.abstractFactory.exemple1;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		
		GUIBuilder builder= new GUIBuilder();
		AbstractWidgetFactory widgetFactory= null;
		
		//check what platform we're on
		String platform= "MACOSX";
		if (platform.equals("MACOSX")) {
			widgetFactory= new MacOsWidgetFactory();
		}else {
			widgetFactory= new MsWindowWidgetFactory();
		}
		builder.buildWindow(widgetFactory);
		System.out.println(widgetFactory.toString());
	}

}
