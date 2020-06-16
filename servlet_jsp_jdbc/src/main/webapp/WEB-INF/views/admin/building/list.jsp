<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 5/20/2020
  Time: 10:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>BuildingList</title>
	</head>
	<body >
		<div class="main-container" id="main-container">
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>

			<div id="sidebar" class="sidebar                  responsive">
				<script type="text/javascript">
					try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
				</script>

				<div class="sidebar-shortcuts" id="sidebar-shortcuts">
					<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
						<button class="btn btn-success">
							<i class="ace-icon fa fa-signal"></i>
						</button>

						<button class="btn btn-info">
							<i class="ace-icon fa fa-pencil"></i>
						</button>

						<button class="btn btn-warning">
							<i class="ace-icon fa fa-users"></i>
						</button>

						<button class="btn btn-danger">
							<i class="ace-icon fa fa-cogs"></i>
						</button>
					</div>

					<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
						<span class="btn btn-success"></span>

						<span class="btn btn-info"></span>

						<span class="btn btn-warning"></span>

						<span class="btn btn-danger"></span>
					</div>
				</div><!-- /.sidebar-shortcuts -->

				<ul class="nav nav-list">
					<!--li class="active">
						<a href="index.html">
							<i class="menu-icon fa fa-tachometer"></i>
							<span class="menu-text"> Dashboard </span>
						</a>

						<b class="arrow"></b>
					</li-->

					<li class="">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa fa-desktop"></i>
							<span class="menu-text">
								UI &amp; Elements
							</span>

							<b class="arrow fa fa-angle-down"></b>
						</a>

						<b class="arrow"></b>

						<ul class="submenu">
							<li class="">
								<a href="typography.html">
									<i class="menu-icon fa fa-caret-right"></i>
									Typography
								</a>

								<b class="arrow"></b>
							</li>
                        </ul>

				</ul><!-- /.nav-list -->


            </div>

			<div class="main-content">
					<div class="main-content-inner">
						<div class="breadcrumbs" id="breadcrumbs">
							<script type="text/javascript">
								try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
							</script>

							<ul class="breadcrumb">
								<li>
									<i class="ace-icon fa fa-home home-icon"></i>
									<a href="#">Home</a>
								</li>
								<li class="active">Dashboard</li>
							</ul><!-- /.breadcrumb -->
						</div>

						<div class="page-content">
							<div class="page-header">
								<h1>
									Dashboard
									<small>
										<i class="ace-icon fa fa-angle-double-right"></i>
										overview &amp; stats
									</small>
								</h1>
							</div><!-- /.page-header -->

							<div class="row">
                                <div class="col-xs-12">
									<c:set var="buildingListURL" value="/admin/building/list"/>
									<form:form action="${buildingListURL}" method="get" modelAttribute="model">
										<div class="widget-box">
											<div class="widget-header">
																	<h4 class="widget-title">Tìm kiếm</h4>

																	<div class="widget-toolbar">
																		<a href="#" data-action="collapse">
																			<i class="ace-icon fa fa-chevron-up"></i>
																		</a>

																		<a href="#" data-action="close">
																			<i class="ace-icon fa fa-times"></i>
																		</a>
																	</div>
											</div>
											<div class="widget-body">
												<div class="widget-main">
													<div class="row">
														<div class="col-xs-12">
															<!-- PAGE CONTENT BEGINS -->
															<div class="col-sm-6">
																<label for="name">Tên tòa nhà</label>
																<input type="text" id="name" class="form-control" name="name" value="${model.name}"/>
															</div>

															<div class="col-sm-6">
																<label for="buidlingArea">Diện tích sàn</label>
																<input type="number" id="buidlingArea" class="form-control" />
															</div>

															<div class="col-sm-2">
																	<div>
																		<label for="district">Quận hiện có</label>
																		<br />
																		<select class="chosen-select form-control" id="district" name="district" data-placeholder="Choose a State 1...">
																			<option value=""> --Quận hiện có--</option>
																			<option value="1">Quận 1</option>
																			<option value="2">Quận 2</option>
																			<option value="3">Quận 3</option>
																			<option value="4">Quận 4</option>
																			<option value="5">Quận 5</option>
																			<option value="6">Quận 6</option>
																			<option value="7">Quận 7</option>
																			<option value="8">Quận 8</option>
																			<option value="9">Quận 9</option>
																			<option value="10">Quận 10</option>
																			<option value="11">Quận 11</option>
																			<option value="12">Quận 12</option>
																			<option value="13">Quận Bình Tân</option>
																			<option value="14">Quận Bình Thạnh</option>
																			<option value="15">Quận Gò Vấp</option>
																			<option value="16">Quận Phú Nhuận</option>
																			<option value="17">Quận Tân Bình</option>
																			<option value="18">Quận Tân Phú</option>
																			<option value="19">Quận Thủ Đức</option>
																			<option value="20">Huyện Bình Chánh</option>
																			<option value="21">Huyện Cần Giờ</option>
																			<option value="22">Huyện Củ Chi</option>
																			<option value="23">Huyện Hóc Môn</option>
																			<option value="24">Huyện Nhà Bè</option>

																		</select>
																	</div>
															</div>

															<div class="col-sm-5">
																<label for="ward">Phường</label>
																<input type="text" id="ward" name="ward" value="${model.ward}" class="form-control" />
															</div>

															<div class="col-sm-5">
																<label for="street">Đường</label>
																<input type="text" id="street" name ="street" value="${model.street}" class="form-control" />
															</div>

															<div class="col-sm-4">
																<label for="basement">Số tầng hầm</label>
																<input type="number" id="basement" class="form-control" />
															</div>

															<div class="col-sm-4">
																<label for="diretion">Hướng</label>
																<input type="text" id="diretion" class="form-control" />
															</div>

															<div class="col-sm-4">
																<label for="type">Hạng</label>
																<input type="text" id="type" class="form-control" />
															</div>

															<div class="col-sm-3">
																<label for="fromArea">Diện tích từ</label>
																<input type="number" id="fromArea" class="form-control" />
															</div>

															<div class="col-sm-3">
																<label for="toArea">Diện tích đến</label>
																<input type="number" id="toArea" class="form-control" />
															</div>


															<div class="col-sm-3">
																<label for="fromRent">Giá thuê từ</label>
																<input type="number" id="fromRent" class="form-control" />
															</div>


															<div class="col-sm-3">
																<label for="toRent">Giá thuê đến</label>
																<input type="number" id="toRent" class="form-control" />
															</div>

															<div class="col-sm-4">
																<label for="managerName">Tên quản lý</label>
																<input type="text" id="managerName" class="form-control" />
															</div>

															<div class="col-sm-4">
																<label for="managerPhone">Số điện thoại quản lý</label>
																<input type="text" id="managerPhone" class="form-control" />
															</div>

															<div class="col-sm-3">
																<label for="staff">Chọn nhân viên phụ trách</label>
																	<div>
																		<select class="chosen-select form-control" id="staff" data-placeholder="Choose a State...">
																			<option value="">--Nhân viên phụ trách--</option>
																			<option value="AL">Alabama</option>
																			<option value="AK">Alaska</option>
																		</select>
																	</div>
															</div>

															<div class="col-sm-2">
																<div class="checkbox">
																	<label>
																		<input name="form-field-checkbox" type="checkbox" class="ace" />
																		<span class="lbl"> Tầng trệt</span>
																	</label>
																</div>
															</div>
															<div class="col-sm-2">
																<div class="checkbox">
																		<label>
																			<input name="form-field-checkbox" type="checkbox" class="ace" />
																			<span class="lbl"> Nguyên căn</span>
																		</label>
																</div>
															</div>

															<div class="col-sm-2">
																<div class="checkbox">
																		<label>
																			<input name="form-field-checkbox" type="checkbox" class="ace" />
																			<span class="lbl"> Nội thất</span>
																		</label>
																</div>
															</div>

															<div class="col-sm-7">

																		<button type="submit" class="btn btn-sm btn-success" id="btnSearchBuilding">
																			Tìm kiếm
																			<i class="ace-icon fa fa-arrow-right icon-on-right bigger-110"></i>
																		</button>

															</div>
															<!-- PAGE CONTENT ENDS -->
														</div><!-- /.col -->
													</div><!--/row-->
												</div>

													<div class="pull-right">
															<button class="btn btn-info" data-toggle="tooltip" title="Thêm tòa nhà" id="btnAddBuilding">
																	<a href="edit">
																		<i class="fa fa-plus-circle" aria-hidden="true"></i>a
																	</a>
															</button>
															<button class="btn btn-info" data-toggle="tooltip" title="Xóa tòa nhà">
																	<i class="ace-icon fa fa-trash-o" aria-hidden="true"></i>
															</button>
													 </div>
											</div>
										</div><!--widget-box-->
									</form:form>
                            </div>
							</div><!-- /.row -->
								<br/>
							<div class="row">
								<div class="col-xs-12">
									<table id="simple-table" class="table table-striped table-bordered table-hover">
										<thead>
													<tr>
														<th class="center">
															<label class="pos-rel">
																<input type="checkbox" class="ace" />
																<span class="lbl"></span>
															</label>
														</th>
														<th>Ngày</th>
														<th>Tên tòa nhà</th>
														<th>Địa chỉ</th>
														<th>Tên quản lý</th>
														<th>Số điện thoại</th>
														<th>Diện tích sàn</th>
														<th>Giá thuê</th>
														<th>Phí dịch vụ</th>
														<th>Thao tác</th>
													</tr>
										</thead>

										<tbody>
												<c:forEach var="item" items="${buildings}">
													<tr>
                                                        <td><input type="checkbox" value="" id=""/></td>
														<td>ab</td>
														<td>abc</td>
														<td>${item.name}</td>
														<td>abc</td>
														<td>abc</td>
														<td>abc</td>
														<td>abc</td>
														<td>abc</td>
														<td>abc</td>
														<td>
															<button class="btn btn-xs btn-info" data-toggle="tooltip" title="Giao tòa nhà cho nhân viên" onclick="assignmentBuilding()">
																<i class="fa fa-child" aria-hidden="true"></i>
															</button>
														</td>
													</tr>
												</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
						</div><!-- /.page-content -->
					</div>
			</div><!-- /.main-content -->

			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
			</a>
		</div><!-- /.main-container -->

		  <!-- Modal -->
  <div class="modal fade" id="assignmentBuildingModal" role="dialog">
    <div class="modal-dialog">

      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Danh sách nhân viên</h4>
        </div>
        <div class="modal-body">
			<table class="table table-bordered">
				<thead>
				  <tr>
					<th>Chọn nhân viên</th>
					<th>Họ và tên nhân viên</th>
				  </tr>
				</thead>
				<tbody>
				  <tr>
					<td>
						<div class="checkbox">
							<label><input type="checkbox" value="1" id = "checkbox_1"></label>
						  </div>
					</td>
					<td>Nguyễn Văn A</td>
				  </tr>
				  <tr>
					<td>
						<div class="checkbox">
							<label><input type="checkbox" value="2" id = "checkbox_2"></label>
						  </div>
					</td>
					<td>Nguyễn Văn B</td>
				  </tr>
				</tbody>
			</table>
        </div>
        <div class="modal-footer">
		<button type="button" class="btn btn-default" data-dismiss="modal">Giao tòa nhà</button>
          <button type="button" class="btn btn-default" data-dismiss="modal">Đóng</button>
        </div>
      </div>

    </div>
  </div>
	</body>
</html>
