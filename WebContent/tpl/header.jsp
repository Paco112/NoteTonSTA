<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	boolean logged = request.getSession().getAttribute("username") != null;
	String contextPath = getServletContext().getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Note ton STA - </title>
<link rel="stylesheet" type="text/css" href="<%= contextPath %>/css/default.css" media="all" />
<link rel="stylesheet" type="text/css" href="<%= contextPath %>/css/form.css" media="all" />
<link rel="stylesheet" type="text/css" href="<%= contextPath %>/css/login.css" media="all" />
<link rel="stylesheet" type="text/css" href="<%= contextPath %>/css/table.css" media="all" />
</head>
<body>
