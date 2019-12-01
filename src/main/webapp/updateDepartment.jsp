<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; utf-8" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set value="${pageContext.request.contextPath}" var="app"></c:set>
<html>
<head>
    <title>update Emp</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css"
          href="${app}/css/style.css"/>
</head>

<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    2009/11/20
                    <br/>
                </p>
            </div>
            <div id="topheader">
                <h1 id="title">
                    <a href="#">Main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                update Department info:
            </h1>
            <form action="${app}/dep/update" method="post">
                <table cellpadding="0" cellspacing="0" border="0"
                       class="form_table">
                    <tr>
                        <td valign="middle" align="right">
                            部门id:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="dep.id" value="${dep.id}" readonly/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            部门编号:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="dep.depid" value="${dep.depid}"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            部门名称:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="dep.dname" value="${dep.dname}"/>
                        </td>
                    </tr>
                </table>
                <p>
                    <input type="submit" class="button" value="修改"/>
                </p>
            </form>
        </div>
    </div>
    <div id="footer">
        <div id="footer_bg">
            ABC@126.com
        </div>
    </div>
</div>
</body>
</html>
