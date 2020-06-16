<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta charset="utf-8" />

</head>
<body>
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

                    </ul><!-- /.nav-list -->

         </div>

        <div class="main-content">
            <div class="main-content-inner">
                <div class="breadcrumbs" id="breadcrumbs">
                    <script type="text/javascript">
                        try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
                    </script>

                    <ul class="breadcrumb">
                        <li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Home</a>
                        </li>
                        <li class="active">Dashboard</li>
                    </ul>
                    <!-- /.breadcrumb -->

                    <!--div class="nav-search" id="nav-search">
                            <form class="form-search">
                                <span class="input-icon">
                                    <input type="text" placeholder="Search ..." class="nav-search-input" id="nav-search-input" autocomplete="off" />
                                    <i class="ace-icon fa fa-search nav-search-icon"></i>
                                </span>
                            </form>
                        </div-->
                </div>

                <div class="page-content">
                    <div class="row">
                        <div class="col-xs-12">
                            <form class="form-horizontal" role="form" id="formEdit">

                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"
                                           for="name"> Tên tòa nhà </label>
                                    <div class="col-sm-6">
                                        <input type="text" id="name" class="form-control" name="name" />
                                    </div>
                                </div>

                                <!--div class="form-group">
                                        <label class="col-sm-1 control-label no-padding-right" for="form-field-1"> Người quản lý </label>
                                    </div-->

                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"
                                           for="district">Quận hiện có</label>
                                    <div class="col-sm-9">
                                        <select class="col-sm-3 control-label no-padding-right"
                                                id="district" name="district">
                                            <option value="">--Quận hiện có--</option>
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

                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"
                                           for="ward"> Phường </label>
                                    <div class="col-sm-6">
                                        <input type="text" id="ward" class="form-control" name="ward" />
                                    </div>
                                </div>


                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"
                                           for="street"> Đường </label>
                                    <div class="col-sm-6">
                                        <input type="text" id="street" class="form-control"
                                               name="street" />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"
                                           for="structure"> Kết cấu </label>
                                    <div class="col-sm-6">
                                        <input type="text" id="structure" class="form-control"
                                               name="structure" />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"
                                           for="numberofBasement"> Số tầng hầm </label>
                                    <div class="col-sm-6">
                                        <input type="number" id="numberofBasement"
                                               class="form-control" name="numberofBasement" />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"
                                           for="floorArea"> Diện tích sàn </label>
                                    <div class="col-sm-6">
                                        <input type="number" id="floorArea" class="form-control"
                                               name="floorArea" />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"
                                           for="direction"> Hướng </label>
                                    <div class="col-sm-6">
                                        <input type="text" id="direction" class="form-control"
                                               name="direction" />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"
                                           for="level"> Hạng </label>
                                    <div class="col-sm-6">
                                        <input type="text" id="level" class="form-control"
                                               name="level" />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"
                                           for="rentArea"> Diện tích thuê </label>
                                    <div class="col-sm-6">
                                        <input type="text" id="rentArea" class="form-control"
                                               name="rentArea" />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"
                                           for="areaDescription"> Mô tả diện tích </label>
                                    <div class="col-sm-6">
                                        <input type="number" id="areaDescription" class="form-control"
                                               name="areaDescription" />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"
                                           for="priceRent"> Giá thuê </label>
                                    <div class="col-sm-6">
                                        <input type="number" id="priceRent" class="form-control"
                                               name="priceRent" />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"
                                           for="priceDescription"> Mô tả giá </label>
                                    <div class="col-sm-6">
                                        <input type="text" id="priceDescription" class="form-control"
                                               name="priceDescription" />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"
                                           for="carCost"> Phí oto </label>
                                    <div class="col-sm-6">
                                        <input type="text" id="carCost" class="form-control"
                                               name="carCost" />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"
                                           for="motoCost"> Phí moto </label>
                                    <div class="col-sm-6">
                                        <input type="text" id="motoCost" class="form-control"
                                               name="motoCost" />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"
                                           for="overtimeCost"> Phí ngoài giờ </label>
                                    <div class="col-sm-6">
                                        <input type="text" id="overtimeCost" class="form-control"
                                               name="overtimeCost" />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"
                                           for="serviceCost"> Phí dịch vụ </label>
                                    <div class="col-sm-6">
                                        <input type="text" id="serviceCost" class="form-control"
                                               name="serviceCost" />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"
                                           for="electricCost"> Tiền điện </label>
                                    <div class="col-sm-6">
                                        <input type="text" id="electricCost" class="form-control"
                                               name="electricCost" />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"
                                           for="deposit"> Tiền cọc </label>
                                    <div class="col-sm-6">
                                        <input type="text" id="deposit" class="form-control"
                                               name="deposit" />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"
                                           for="payment"> Thanh toán </label>
                                    <div class="col-sm-6">
                                        <input type="text" id="payment" class="form-control"
                                               name="payment" />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"
                                           for="renttime"> Thời hạn thuê </label>
                                    <div class="col-sm-6">
                                        <input type="text" id="renttime" class="form-control"
                                               name="renttime" />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"
                                           for="managername"> Tên quản lý </label>
                                    <div class="col-sm-6">
                                        <input type="text" id="managername" class="form-control"
                                               name="managername" />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"
                                           for="managerphone"> SĐT quản lý </label>
                                    <div class="col-sm-6">
                                        <input type="text" id="managerphone" class="form-control"
                                               name="managerphone" />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"
                                           for="buildingType"> Loại tòa nhà </label>
                                    <div class="col-sm-9">
                                        <label class="checkbox-inline"><input type="checkbox"
                                                                              value="TANG_TRET" id="buildingType" name="buildingType">Tầng
                                            trệt</label> <label class="checkbox-inline"><input
                                            type="checkbox" value="NGUYEN_CAN" id="buildingType"
                                            name="buildingType">Nguyên căn</label> <label
                                            class="checkbox-inline"><input type="checkbox"
                                                                           value="NOI_THAT" id="buildingType" name="buildingType">Nội
                                        thất</label>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right"
                                           for="form-field-1"> </label>
                                    <div class="col-sm-9">
                                        <button type="button" class="btn btn-primary"
                                                id="btnAddBuilding">Thêm tòa nhà</button>
                                        <button type="button" class="btn btn-danger"
                                                id="cancelAddBuilding">Hủy</button>
                                    </div>
                                </div>







                            </form>
                        </div>
                    </div>
                    <!-- /.row -->
            </div>
                <!-- /.page-content -->
         </div>
    </div>
    <!-- /.main-content -->


    <a href="#" id="btn-scroll-up"
       class="btn-scroll-up btn btn-sm btn-inverse"> <i
            class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
    </a>
</div>
<!-- /.main-container -->

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
                <p>Some text in the modal.</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Giao
                    tòa nhà</button>
                <button type="button" class="btn btn-default" data-dismiss="modal">Đóng</button>
            </div>
        </div>

    </div>
</div>
</body>
</html>