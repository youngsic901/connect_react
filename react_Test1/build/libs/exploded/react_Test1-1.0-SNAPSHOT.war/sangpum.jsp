<%@ page language="java" contentType="application/json; text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

{"items":[
    <%
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    String result = "";

    try{
        Class.forName("org.mariadb.jdbc.Driver");
        String url = "jdbc:mariadb://localhost:3306/test";
        conn = DriverManager.getConnection(url, "root", "123");

        /*Thread.sleep(2000);*/

        pstmt = conn.prepareStatement("select * from sangdata");
        rs = pstmt.executeQuery();
        while(rs.next()){
            result += "{";
            result += "\"id\":" + "\"" + rs.getString("code") + "\",";
            result += "\"name\"" + "\"" + rs.getString("sang") + "\",";
            result += "\"price\"" + "\"" + (rs.getInt("su") * rs.getInt("dan")) + "\",";
            result += "},";
        }

        if(result.length() > 0){
            out.print(result);
        }
    } catch (Exception e) {
        System.out.println("처리오류" + e);
    } finally{
        try{
            if(rs != null) rs.close();
            if(pstmt != null) pstmt.close();
            if(conn != null) conn.close();
        } catch (Exception e2){
            System.out.println("처리오류2");
        }
    }
    %>
]}