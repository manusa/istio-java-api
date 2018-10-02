/*
 * Copyright (C) 2018 Red Hat inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.snowdrop.istio.clientv2;

import io.fabric8.kubernetes.client.Client;
import io.fabric8.kubernetes.client.dsl.AnyNamespaceable;
import io.fabric8.kubernetes.client.dsl.Namespaceable;
import io.fabric8.kubernetes.client.dsl.RequestConfigurable;

public interface GenericIstioClient<C extends Client> extends Client, IstioClient,
        Namespaceable<C>,
        AnyNamespaceable<C>,
        RequestConfigurable<C> {
}
