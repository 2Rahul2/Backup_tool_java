module org.openjfx.hellofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.httpcomponents.httpclient;
	requires org.apache.httpcomponents.httpcore;
	requires org.json;
	requires com.fasterxml.jackson.databind; 
	requires org.apache.commons.compress;
	requires com.fasterxml.jackson.annotation;
	requires java.desktop;
	requires dorkbox.systemtray;

	
    requires org.apache.httpcomponents.httpmime;
    opens org.openjfx.hellofx to javafx.fxml;
    
    exports org.openjfx.hellofx;
}