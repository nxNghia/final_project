module ISD.VN {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.logging;
	requires java.sql;
	requires javafx.graphics;
	requires javafx.base;
	
	opens application;
	opens views.screen;
	opens views.screen.home;
	opens views.screen.station;
}
