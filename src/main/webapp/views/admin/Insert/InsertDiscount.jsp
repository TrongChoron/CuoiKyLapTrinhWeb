<%@ include file="/common/taglib.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:url var="APIDiscount" value="/api-admin-discount"/>
<html>
    <body>

        <form id="formDiscount">
            <div class="page-header">
                <h1 class="page-heading">Discount</h1>
                <ul class="list-inline text-sm">
                    <li class="list-inline-item"><a class="text-gray-600" href="#!"><i class="fas fa-copy me-2"> </i>Duplicate</a></li>
                    <li class="list-inline-item"><a class="text-gray-600" href="#!"><i class="fas fa-download me-2"> </i>Export</a></li>
                </ul>
            </div>
            <section>
                <div class="row mb-5">
                    <div class="col-lg-8 col-xxl-9 mb-4 mb-lg-0">
                        <div class="card mb-4">
                            <div class="card-header">
                                <div class="card-heading">Main Info </div>
                            </div>
                            <div class="card-body">
                                <div class="row gy-3">
                                    <div class="col-12">
                                        <label class="form-label fw-bold">Discount Name</label>
                                        <div class="input-group">
                                            <div class="input-group-text">$</div>
                                            <input name="discountName" class="form-control" value="${discountModel.discountName}">
                                        </div>
                                    </div>  
                                        <div class="col-12 col-lg-6 text-sm">
                                        <label class="form-label text-muted">Description</label>
                                        <div class="input-group">
                                            <div class="input-group-text">$ </div>
                                            <input name="description" class="form-control" value="${discountModel.description}">
                                        </div>
                                    </div>
                                    <div class="col-12 col-lg-6 text-sm">
                                        <label class="form-label text-muted">Discount Percent</label>
                                        <div class="input-group">
                                            <div class="input-group-text">$ </div>
                                            <input name="discountPercent" class="form-control" value="${discountModel.discountPercent}">
                                        </div>
                                    </div>
                                    
                                </div>
                                <div style="margin-top: 10px" class="form-text" id="notification"></div>
                                <input type="hidden" value="${discountModel.discountId}" id="id" name="discountId"/>
                                <c:if test="${empty discountModel}">
                                    <button id="btnAddOrUpdate" style="margin-top: 10px" class="btn btn-outline-primary mb-4">Add Discount</button>
                                </c:if>
                                <c:if test="${not empty discountModel}">
                                    <button id="btnAddOrUpdate" style="margin-top: 10px" class="btn btn-outline-primary mb-4">Update</button>
                                </c:if>

                            </div>
                        </div>
                    </div>

                </div>
            </section>
        </form>

        <script>
            $('#btnAddOrUpdate').click(function (e) {
                e.preventDefault(); // submit về 1 API
                var data = {};
                var formData = $('#formDiscount').serializeArray();
                $.each(formData, function (i, v) {
                    data["" + v.name + ""] = v.value;
                });
                var id = $('#id').val();
                console.log(data);
                if (id == "") {
                    addDiscount(data);
                    $('#formDiscount')[0].reset();
                } else {
                    updateDiscount(data);
                }
            });
            function addDiscount(data) {
                $.ajax({
                    url: '${APIDiscount}',
                    type: 'POST',
                    contentType: 'application/json',
                    data: JSON.stringify(data),
                    dataType: 'json',
                    success: function (result) {
                        $('#notification').html(`
                            <div class="alert alert-success">
                                    Congratulations, Add new Discount success
                            </div>`)
                    },
                    error: function (error) {
                        console.log("Error")
                    }
                });
            }
            function updateDiscount(data) {
                $.ajax({
                    url: '${APIDiscount}',
                    type: 'PUT',
                    contentType: 'application/json',
                    data: JSON.stringify(data),
                    dataType: 'json',
                    success: function (result) {
                        $('#notification').html(`
                            <div class="alert alert-success">
                                    Congratulations, Update profile success
                            </div>`)
                    },
                    error: function (error) {
                        $('#notification').html(`
                            <div class="alert alert-danger">
                                    Sorry, Update profile not success.
                            </div>`)
                    }
                });
            }
        </script>
    </body>
</html>

