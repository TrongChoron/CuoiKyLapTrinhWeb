<%@ include file="/common/taglib.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:url var="APIManufacter" value="/api-admin-manufacter"/>
<html>
    <body>

        <form id="formmanufacter">
            <div class="page-header">
                <h1 class="page-heading">Manufacture</h1>
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
                                        <label class="form-label fw-bold">Manufacture Name</label>
                                        <div class="input-group">
                                            <div class="input-group-text">$</div>
                                            <input name="manufactName" class="form-control" value="${manufacterModel.manufactName}">
                                        </div>
                                    </div>                                    
                                </div>
                                <div style="margin-top: 10px" class="form-text" id="notification"></div>
                                <input type="hidden" value="${manufacterModel.manufactId}" id="id" name="manufactId"/>
                                <c:if test="${empty manufacterModel}">
                                    <button id="btnAddOrUpdate" style="margin-top: 10px" class="btn btn-outline-primary mb-4">Add Manufacture</button>
                                </c:if>
                                <c:if test="${not empty manufacterModel}">
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
                var formData = $('#formmanufacter').serializeArray();
                $.each(formData, function (i, v) {
                    data["" + v.name + ""] = v.value;
                });
                var id = $('#id').val();
                console.log(data);
                if (id == "") {
                    addManufacture(data);
                    $('#formmanufacter')[0].reset();
                } else {
                    updateManufacture(data);
                }
            });
            function addManufacture(data) {
                $.ajax({
                    url: '${APIManufacter}',
                    type: 'POST',
                    contentType: 'application/json',
                    data: JSON.stringify(data),
                    dataType: 'json',
                    success: function (result) {
                        $('#notification').html(`
                            <div class="alert alert-success">
                                    Congratulations, Add new Manufacture success
                            </div>`)
                    },
                    error: function (error) {
                        console.log("Error")
                    }
                });
            }
            function updateManufacture(data) {
                $.ajax({
                    url: '${APIManufacter}',
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

