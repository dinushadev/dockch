<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="dist/css/jquery.dataTables.css">
<title>DockList	</title>
</head>
<body>
 <div class="tab-pane" id="docTabDiv">
      <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#docDetails">New Doctor</button>
        <table class="table table-hover table table-striped table-bordered" cellpadding="0" cellspacing="0" border="0" id="hospitalListTable">
          <thead>
            <tr>
              <th>Name</th>
              <th>Specialization</th>
              <th>Availablity</th>
              <th>More</th>
              <th>(edit)</th>
            </tr>
          </thead>
    
        </table>

      </div>

      <script type="text/javascript" src="dist/js/jquery.dataTables.min.js"> </script>
</body>
</html>