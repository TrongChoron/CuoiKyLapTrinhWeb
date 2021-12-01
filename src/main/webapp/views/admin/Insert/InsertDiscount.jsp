<%@ include file="/common/taglib.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:url var="Manufacter" value="/api-admin-manufacter"/>
<html>
    <body>

        <form id="formmanufacter">
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
                                            <input name="name" class="form-control" value="${discountModel.discountName}">
                                        </div>
                                    </div>  
                                        <div class="col-12 col-lg-6 text-sm">
                                        <label class="form-label text-muted">Description</label>
                                        <div class="input-group">
                                            <div class="input-group-text">$ </div>
                                            <input name="size" class="form-control" value="${discountModel.description}">
                                        </div>
                                    </div>
                                    <div class="col-12 col-lg-6 text-sm">
                                        <label class="form-label text-muted">Discount Percent</label>
                                        <div class="input-group">
                                            <div class="input-group-text">$ </div>
                                            <input name="quantity" class="form-control" value="${discountModel.discountPercent}">
                                        </div>
                                    </div>
                                    
                                </div>
                                <div style="margin-top: 10px" class="form-text" id="notification"></div>
                                <input type="hidden" value="${discountModel.discountId}" id="id" name="id"/>
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

        <!--        <script>
                    $('#btnAddOrUpdate').click(function (e) {
                        e.preventDefault(); // submit về 1 API
                        var data = {};
                        var formData = $('#formproduct').serializeArray();
                        $.each(formData, function (i, v) {
                            data["" + v.name + ""] = v.value;
                        });
                        const ref = firebase.storage().ref();
                        const file = document.querySelector('#avatar').files[0];
                        const metadata = {
                            contentType: file.type
                        };
                        const name = file.name;
                        const uploadIMG = ref.child(name).put(file, metadata);
                        uploadIMG.then(snapshort => snapshort.ref.getDownloadURL())
                                .then(url => {
                                    console.log(url);
                                    data["avatar"] = url;
                                    var id = $('#id').val();
                                    if (id == "") {
                                        addProduct(data);
                                        $('#formproduct')[0].reset();
                                    } else {
                                        updateProduct(data);
                                    }
                                })
                                .catch(console.error)
                    });
                    function addProduct(data) {
                        $.ajax({
                            url: '${APIProduct}',
                            type: 'POST',
                            contentType: 'application/json',
                            data: JSON.stringify(data),
                            dataType: 'json',
                            success: function (result) {
                                $('#notification').html(`
                                    <div class="alert alert-success">
                                            Congratulations, Add Product profile success
                                    </div>`)
                            },
                            error: function (error) {
                                console.log("Error")
                            }
                        });
                    }
                    function updateProduct(data) {
                        $.ajax({
                            url: '${APIProduct}',
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
                                window.location.href = "${NewURL}?type=list&maxPageItem=2&page=1&message=error_system";
                            }
                        });
                    }
                </script>-->
    </body>
</html>

