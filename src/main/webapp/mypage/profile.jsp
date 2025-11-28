<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>マイページ</title>
    <link rel="stylesheet" href="../css/mypage/profile.css">
</head>
<body>

<header class="header">
    <h1>マイページ</h1>
</header>

<nav class="nav">
    <a href="#" class="active">プロフィール</a>
    <a href="records.jsp">旅の記録</a>
    <a href="subsc.jsp">サブスクリプション</a>
</nav>

<main class="container">
    <section class="profile-section">
        <h2>プロフィール</h2>

        <!-- ユーザー名 -->
        <div class="form-group">
    		<span class="form-label">ユーザーネーム</span>
    		<span class="form-value">${username}</span>
    		<a href="username.jsp" class="btn-primary">編集</a>
		</div>

        <!-- ID（変更不可） -->
        <div class="form-group">
    		<span class="form-label">ID</span>
    		<span class="form-value">${userid}</span>
		</div>

        <!-- メールアドレス -->
        <div class="form-group">
    		<span class="form-label">メールアドレス</span>
    		<span class="form-value">${email}</span>
    		<a href="email.jsp" class="btn-primary">編集</a>
		</div>

        <div class="form-group password-group">
    		<a href="password.jsp" class="btn-password">パスワード変更</a>
		</div>
    </section>
</main>
</body>
</html>
