<h1 align='center'><img src='https://user-images.githubusercontent.com/112446846/212536602-adb5b363-0bd7-4417-86d4-5157a2f5f9a1.jpg' style='width: 80px; height: 30px;'>&nbsp;Naver Corporation</h1><br/>

## 목차
 - [개요](https://github.com/dllgkdud/pro3#개요)
 - [사용자 인터페이스](https://github.com/dllgkdud/pro3#사용자-인터페이스)
 - [기술 환경](https://github.com/dllgkdud/pro3#기술-환경)
 - [시스템 구조](https://github.com/dllgkdud/pro3#시스템-구조)
 - [프로젝트 설계](https://github.com/dllgkdud/pro3#프로젝트-설계)
 - [핵심 기능](https://github.com/dllgkdud/pro3#핵심-기능)
 - [기능 구현](https://github.com/dllgkdud/pro3#기능-구현)

## 개요
포털사이트 점유율 약 69%를 차지하는 네이버의 코퍼레이션 기업형 웹 애플리케이션 사이트를 주제로 구현했습니다.<br/><br/>
✔담당자 : 이하영

## 사용자 인터페이스

<details>
<summary>사용자 인터페이스</summary>

* **메인 페이지**
  * `Ajax`로 작성된 `로그인`, `회원가입`, `메뉴`로 이동합니다.

  <img width="1425" alt="메인" src="https://user-images.githubusercontent.com/112446846/212546756-934331af-fdb8-462f-b1b3-2a8039285789.png">

* **홍보목록 페이지**
  * 작성된 `보도`를 확인하고 `상세` 페이지로 이동하거나 `작성` 페이지로 이동합니다.

  <img width="1425" alt="홍보 목록" src="https://user-images.githubusercontent.com/112446846/212547172-0cc39552-8ef3-4d51-b398-420ec3d4f6d7.png">

* **보도상세 페이지**
  * `ckeditor.js`를 이용해 `등록`된 보도의 `상세정보`를 `확인`하며, `수정`, `삭제`를 진행합니다.

  <img width="1425" alt="보도 상세" src="https://user-images.githubusercontent.com/112446846/212547225-dc76e2ee-e8e6-42ad-b1ba-22c9cae29de4.png">
  
* **보도수정 페이지**
  * `ckeditor.js`를 이용해 `등록`된 보도의 `사진` 및 `내용`을 `수정`합니다.

  <img width="1425" alt="보도 수정" src="https://user-images.githubusercontent.com/112446846/212547239-c9f8896b-20d5-4afb-890d-c2a20545d630.png">

</details>

## 기술 환경
 - Language(Front) : `Html5`, `CSS3`, `Javascript`, `JQuery`
 - Language(Back) : `Java`, `Jsp`
 - Editor : `Spring Tool Suite 3`
 - DBMS : `Oracle`
 - DBMS Model : `MVC Level 2`
 - Framework(front) : `Foundation`
 - Framework(back) : `Spring Legacy`
 - Security : `BCryptPasswordEncoder`
 - Target : `Web Browser`
 - Server : `Tomcat 9`
 - Infra : `EC2`, `RDS`
 - Etc : `Git`

## 시스템 구조
![system](https://user-images.githubusercontent.com/112446846/212549826-e87ef339-6ce4-4319-b639-cf28dfd2552d.PNG)

## 프로젝트 설계
### ERD
![ERD](https://user-images.githubusercontent.com/112446846/212551234-ddebae23-df10-4fa5-b716-7cb045cdfa1d.PNG)

### 메뉴설계도
![메뉴설계도](https://user-images.githubusercontent.com/112446846/212552313-86daaa8b-b32d-4a4b-af85-b6cf3e02445b.PNG "네이버_메뉴설계도")

## 핵심 기능
### 회원
 - 아이디 중복
 - 비밀번호 확인
 - 회원정보
 - 회원정보 수정

### 홍보
 - 홍보 목록
 - 보도 상세
 - 보도 수정

### 공지사항
 - 공지 목록
 - 공지 상세(조회수 책정)

### 관리자
 - 회원 목록
 - 파일 업로드
 - 사진 파일명 랜덤 지정
 - 공지 등록/수정/삭제

## 기능 구현

<details>
<summary>사용자 기능 구현</summary>

* **메인 페이지**
  * `Ajax`로 작성된 `로그인`, `회원가입`, `메뉴`로 이동합니다.
  ![메인](./img/1.png "메인")

* **회원가입 페이지**
  * `가입약관`의 `필수 선택` 후 `가입양식` 페이지로 이동한다.
  ![회원가입](./img/2.png "가입약관")
  ![회원가입](./img/3.0.png "가입양식")
  ![회원가입](./img/3.1.png "가입양식(주소입력)")
  ![회원가입](./img/3.2.png "가입양식(아이디중복)")

* **홍보 페이지**
  * `가입약관`의 `필수 선택` 후 `가입양식` 페이지로 이동한다.
  ![홍보](./img/2.png "가입약관")

</details>

## UI TEST
[![Trello](https://user-images.githubusercontent.com/112446846/212553729-1a459e2d-a2cc-44cd-b4dc-c754264f606c.png)](https://trello.com/b/XjFw7Sdu "UI_TEST")

<details>
<summary>계획서/보고서_다운로드</summary>

  ![[pro4]UI TEST 계획서.pdf](https://github.com/dllgkdud/pro4/files/10420663/pro4.UI.TEST.pdf "계획서_다운로드")
  ![[pro4]UI TEST 결과보고서.pdf](https://github.com/dllgkdud/pro4/files/10420665/pro4.UI.TEST.pdf "보고서_다운로드")

</details>