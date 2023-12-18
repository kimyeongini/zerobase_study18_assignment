<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<html>
<head>
    <title>와이파이 정보 구하기</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <%
        String lat = request.getParameter("lat") == null ? "0.0" : request.getParameter("lat");
        String lnt = request.getParameter("lnt") == null ? "0.0" : request.getParameter("lnt");
    %>

    <div class="input">
        <span>LAT:</span>
        <input type="text" id="lat" value="<%=lat%>">

        <span>LNT:</span>
        <input type="text" id="lnt" value="<%=lnt%>">

        <button id="btn_cur_position"><span>내 위치 가져오기</span></button>
        <button id="btn_nearest_wifi"><span>근처 Wifi 정보 보기</span></button>
    </div>


    <div>
        <table>
            <thead>
            <tr>
                <th>거리(km)</th>
                <th>관리번호</th>
                <th>자치구</th>
                <th>와이파이명</th>

                <th>도로명 주소</th>
                <th>상세 주소</th>

                <th>설치 위치(층)</th>
                <th>설치 기관</th>
                <th>설치 유형</th>

                <th>서비스 구분</th>
                <th>망 종류</th>
                <th>설치 년도</th>
                <th>실내 외 구분</th>
                <th>WIFI 접속 환경</th>

                <th>x좌표</th>
                <th>y좌표</th>
                <th>작업일자</th>
            </tr>
            </thead>
        </table>
    </div>

</body>
</html>