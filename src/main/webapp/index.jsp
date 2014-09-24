<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href='/static/img/favicon/favicon.ico' rel='shortcut icon' type='image/x-icon'>
    <title>Bloggi - your own personal blog</title>

    <!-- Bootstrap -->
    <link href="/static/lib/bootstrap/flatly-theme/bootstrap.min.css" rel="stylesheet">

    <!-- Custom style -->
    <link href="static/css/index/index.css" rel="stylesheet">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<!-- Navigation -->
<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Bloggi</a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li>
                    <a href="#about">About</a>
                </li>
                <li>
                    <a href="#services">Services</a>
                </li>
                <li>
                    <a href="#contact">Contact</a>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Sign <span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="#">Sign In</a></li>
                        <li class="divider"></li>
                        <li><a href="#">Sign Up</a></li>
                    </ul>
                </li>
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container -->
</nav>

<!-- Full Width Image Header -->
<header class="header-image">
    <div class="headline">
        <div class="container">
            <h1>Welcome To Bloggi</h1>
            <h2>Create Your Own Personal Blog</h2>
        </div>
    </div>
</header>

<!-- Page Content -->
<div class="container">

    <hr class="featurette-divider" id="about">

    <!-- First Featurette -->
    <div class="featurette">
        <img class="featurette-image img-circle img-responsive pull-right" src="/static/img/index/about.png">
        <h2 class="featurette-heading">This First Heading
            <span class="text-muted">Will Catch Your Eye</span>
        </h2>
        <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
    </div>

    <hr class="featurette-divider" id="services">

    <!-- Second Featurette -->
    <div class="featurette">
        <img class="featurette-image img-circle img-responsive pull-left" src="/static/img/index/services.png">
        <h2 class="featurette-heading">The Second Heading
            <span class="text-muted">Is Pretty Cool Too.</span>
        </h2>
        <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
    </div>

    <hr class="featurette-divider" id="contact">

    <!-- Third Featurette -->
    <div class="featurette">
        <img class="featurette-image img-circle img-responsive pull-right" src="/static/img/index/contacts.png">
        <h2 class="featurette-heading">The Third Heading
            <span class="text-muted">Will Seal the Deal.</span>
        </h2>
        <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
    </div>

    <hr class="featurette-divider">

    <!-- Footer -->
    <footer>
        <div class="row">
            <div class="col-lg-12">
                <p>Copyright &copy; Bloggi 2014</p>
            </div>
        </div>
    </footer>

</div>
<!-- /.container -->


<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="/static/lib/jquery/jquery-2.1.1.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="/static/lib/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>