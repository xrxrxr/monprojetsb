<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Hello W!</title>
  </head>
  <body>

    <table class="table table-bordered table-hover">
      <tr>
          <th>Name</th>
          <th>Price</th>
      </tr>
      <#list allproducts as item>
          <tr>
            <td>${item.name}</td>
            <td>${item.price}</td>
          </tr>
      </#list>
    </table>




  </body>
</html>
