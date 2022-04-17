<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>

</head>
<body>
<script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
<title>Title</title>

<h4>여기는 게시판 페이지</h4>
<hr>
<form>
    <select id="selection" name="language" onchange="handleOnChange(this)">
        <option value="none">=== 선택 ===</option>
        <option value="korean">한국어</option>
        <option value="english">영어</option>
        <option value="chinese">중국어</option>
        <option value="spanish">스페인어</option>
    </select>
    <button>excel 출력</button>
    <button id="targetCar" style="display: none">gpx 출력</button>
</form>
<script>
    function handleOnChange(e) {
        // 선택된 데이터 가져오기
        const value = e.value;

        if (value === "english") {
            document.getElementById("targetCar").style.display = "";
        } else {
            document.getElementById("targetCar").style.display = "none";
        }
    }
</script>
<hr>


<table>
    <thead>
    <tr>
        <th>아이디</th>
        <th>이름</th>
        <th>이메일</th>
        <th>전화번호</th>
        <th>가입 날짜</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${memberList}" var="member">
        <tr>
            <td>${member.id}</td>
            <td>${member.name}</td>
            <td>${member.email}</td>
            <td>${member.phone}</td>
            <td>${member.date}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
