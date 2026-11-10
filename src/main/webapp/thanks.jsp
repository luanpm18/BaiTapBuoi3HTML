<!doctype html>
<html>
<head>
    <title>Thanks</title>
    <link rel="stylesheet" href="styles/style2.css"/>
</head>
<body>
<h1>Thanks for joining our email list</h1>

<p>Here is the information that you entered:</p>

<label>Email:</label>
<span>${user.email}</span><br>
<label>First Name:</label>
<span>${user.firstName}</span><br>
<label>Last Name:</label>
<span>${user.lastName}</span><br>
<label>Date:</label>
<span>${user.date}</span><br>
<label>Hear About:</label>
<span>${survey.hearAbout}</span><br>
<label>Announcement Like:</label>
<span>${survey.announcementLike}</span><br>
<label>Announcement Send:</label>
<span>${survey.announcementSend}</span><br>
<label>Contact me by:</label>
<span>${survey.contactMethod}</span><br>

<p>To enter another email address, click on the Back
  button in your browser or the Return button shown
  below.</p>

<form action="" method="get">
  <input type="hidden" name="action" value="join">
  <input type="submit" value="Return">
</form>
</body>
</html>
