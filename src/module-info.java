module ISD.VN {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.logging;
	requires java.sql;
	requires javafx.graphics;
	requires javafx.base;
	requires java.base;
	
	opens application;
	opens views.screen;
	opens views.screen.home;
	opens views.screen.station;
	opens views.screen.bike;
	opens views.screen.rentbike;
	opens views.screen.payment;
	opens views.screen.returnbike;
	opens views.screen.popup;
	opens views.screen.barcode;
}
