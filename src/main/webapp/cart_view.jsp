<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>상품 확인</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<img src="image.png" class="img-fluid" alt="이미지">
			</div>
			<div class="col-md-6">
				<h3>상품명</h3>
				<p>상품 설명</p>
				<ul class="list-group">
					<li class="list-group-item"><strong class="text-right">이름 &nbsp;&nbsp;:</strong>
						상품명</li>
					<li class="list-group-item"><strong class="text-right">색상 &nbsp;&nbsp;:</strong>
						색상</li>
					<li class="list-group-item"><strong class="text-right">사이즈 :</strong>
						사이즈</li>
					<li class="list-group-item"><strong class="text-right">가격 &nbsp;&nbsp;:</strong>
						가격</li>
				</ul>
			</div>
		</div>
		<div class="row">
			<div class="col-12 mt-2">
				<a href="detail.do" class="btn btn-secondary float-left">뒤로가기</a> <a
					href="purchaseList.do" class="btn btn-primary float-right">구매하기</a>
			</div>
		</div>
	</div>
</body>
</html>
