package com.Model;

import org.springframework.stereotype.Component;

@Component
public class MailClass {
private String to;
public String getTo() {
	return to;
}
public void setTo(String to) {
	this.to = to;
}
public String getSub() {
	return sub;
}
public void setSub(String sub) {
	this.sub = sub;
}
public String getText() {
	return text;
	
}
@Override
public String toString() {
	return "MailClass [to=" + to + ", sub=" + sub + ", text=" + text + "]";
}
public void setText(String text) {
	this.text = text;
}
private String sub;
private String text;
}
